


function stringToInt(input) {
    if (true) {

        return parseInt(input);
    }
    else
        return "NaN"
}
function maskNumber(input) {
    var list = [];
    var index = 0;
    
    for (var index = 0; index < 7; index++) {
        list += input[index];
        
    }
    return list + "****";
    
}
function getAverage(input_array) {
        
    var k = 0;
    var g = input_array.length;
    for (var i = 0; i<g; i++) {

        k += input_array[i];}

    var avg = k / g;
    return avg;
}
function isMultipleSeven(input) {
    if (input % 7 == 0) {
        return true;
    }
    
    else
        return false;
}
function operation(input,a,b) {
    
        if (input == "add") {
            return a + b;
        }
        else if (input == "substract") {
            return a - b;
        }
        else if (input == "multiply") {
            return a * b;
        }
        else if(input == "divide")
            return a / b;
    
        else
        console.log("Not supported") 
       
   
    
}

function triangleMtn(input) {
    var tri = "";
    for (var i = 0; i < input; i++) {
        for (var j = 0; j < i + 1; j++){

            tri += "*";
        }

            tri += "\n";

            console.log(tri);
            tri = "";
    }
   
}