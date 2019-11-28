function showname(){
    let Name = document.getElementById("name")
}

function mypwd(){
let val = document.getElementById("pwd");
if(val.type === "password"){
    val.type = "text";
}else{
    val.type = "password";
}
}