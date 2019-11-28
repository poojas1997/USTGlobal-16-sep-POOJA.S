//Named function
function factorial(a)
{
    var fact = 1;
    for(i = 1; i <= a; i++)
    {
        var fact = fact *  i;
    }
    console.log("factorial =",fact)
}
factorial(5);
console.log('----------------------')

//Function Expression
var factorial = function(b)
{
    var fact = 1;
    for( i = b; i > 0 ; i--)
    {
        var fact = fact * i;
    }
    console.log("factorial =",fact)
}
 factorial(4);
 console.log('----------------------');

 //self invoked function
 (function(c)
 {
    var fact = 1;
    for(i = c; i > 0; i--)
    {
        var fact = fact * i;
    }
    console.log('factorial =',fact)
 })(3);
 console.log('----------------------')

 //FatArrow function
 var fact = d => {
     var fact = 1;
    for(i = d; i > 0; i-- )
    {
        fact = fact * i;
    }
    console.log('factorial = ',fact)
}
fact(2);


