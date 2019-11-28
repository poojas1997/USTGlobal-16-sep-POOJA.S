let username = document.getElementById('username').value
let Password = document.getElementById('Password')
let username1 = username.trim()
if( username1.length > 5 && Password.length > 6)
{
  document.getElementById('b2').disabled = false
}