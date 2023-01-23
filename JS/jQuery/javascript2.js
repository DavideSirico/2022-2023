function checkPasswords()
{
    var password1 = $("#password").val();
    var password2 = $("#password2").val();
	var check = $("#check");
	if (password1!= password2) {
		check.html("<p>Le due password sono discordanti</p>");
	} else {
		check.html("<p>Le due password sono uguali</p>");
	}
}
function checkEmail()
{
    var email = $("#email").val();
    var check = $("#check");
    if (email.indexOf("@") == -1) {
        check.html("<p>L'email non e' valida</p>");
    } else
    {
        check.html("");
    }
}
