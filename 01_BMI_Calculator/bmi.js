const form = document.querySelector('form')

form.addEventListener('submit', function(e){
    e.preventDefault()

   const height= parseInt(document.querySelector('#height').value)
   const weight= parseInt(document.querySelector('#weight').value)
      const result=document.querySelector('#results')

      if( height ==="" || isNaN(height) || height<0 ){
        result.innerHTML = "Plese Enterr a valid number"
      }
      else if( weight === "" || isNaN(weight) || weight<0 ){
        result.innerHTML = "Plese Enterr a valid number"
      }
      else{
     const bmi = (weight / ((height / 100) ** 2)).toFixed(2);
    result.innerHTML = `<span>Your BMI is: ${bmi}</span>`; 
     }

      

})

