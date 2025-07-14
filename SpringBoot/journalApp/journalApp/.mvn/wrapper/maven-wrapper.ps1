$ErrorActionPreference = "Stop"

# Set Maven user home
if (-not $env:MAVEN_USER_HOME) {
    $MAVEN_USER_HOME = "$HOME/.m2"
} else {
    $MAVEN_USER_HOME = $env:MAVEN_USER_HOME
}

# Load properties
$wrapperPropertiesPath = Join-Path $PSScriptRoot "../wrapper/maven-wrapper.properties"
$properties = @{}
Get-Content $wrapperPropertiesPath | ForEach-Object {
    if ($_ -match '^\s*([^#].*?)=(.*)$') {
        $properties[$matches[1]] = $matches[2].Trim()
    }
}
$distributionUrl = $properties["distributionUrl"]
if (-not $distributionUrl) {
    Write-Error "Missing 'distributionUrl' in maven-wrapper.properties"
    exit 1
}

# Calculate paths
$distributionFileName = ($distributionUrl -split "/")[-1]
$distributionBaseDir = Join-Path $MAVEN_USER_HOME "wrapper/dists"
$distributionName = ($distributionFileName -replace '-bin\.zip$', '')
$hash = [System.BitConverter]::ToString((New-Object Security.Cryptography.MD5CryptoServiceProvider).ComputeHash([System.Text.Encoding]::UTF8.GetBytes($distributionUrl))).Replace("-", "").ToLower()
$installDir = Join-Path $distributionBaseDir "$distributionName\$hash"

# Maven executable
$mvnwCmd = Join-Path $installDir "apache-maven-*\bin\mvn.cmd"

# Download if necessary
if (-not (Test-Path $installDir)) {
    Write-Host "Downloading Maven from $distributionUrl"
    $tempZip = Join-Path $env:TEMP $distributionFileName
    Invoke-WebRequest -Uri $distributionUrl -OutFile $tempZip
    Expand-Archive -Path $tempZip -DestinationPath $installDir
    Remove-Item $tempZip
}

# Locate mvn.cmd
$mvnExecutable = Get-ChildItem -Path $installDir -Recurse -Filter "mvn.cmd" | Select-Object -First 1
if (-not $mvnExecutable) {
    Write-Error "Maven executable not found after extraction"
    exit 1
}

# Output environment variable for the wrapper batch to consume
Write-Output "MVN_CMD=$($mvnExecutable.FullName)"
exit 0
