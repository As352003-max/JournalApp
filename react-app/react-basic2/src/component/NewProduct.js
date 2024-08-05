import './NewProduct.css'
import ProductForm from './ProductForm';

function NewProduct(){

    function saveProduct(product){
        console.log("I am inside new product");
    }
return (<div className='new-product'>
    <ProductForm onSaveProduct={saveProduct}></ProductForm>
</div>)

}

export default NewProduct;