const countValue = document.querySelector('#counter');

const increment = () => {
    // parseInt convert string value into integer value
    // get the value from ui
    let value = parseInt(countValue.innerText);
    // update the value
    value=value+1;
    // set the value onto ui
    countValue.innerText=value;
};

const decrement = () => {
    // parseInt convert string value into integer value
    // get the value from ui
    let value = parseInt(countValue.innerText);
    // update the value
    value=value-1;
    // set the value onto ui
    countValue.innerText=value;
};