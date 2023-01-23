function checkPasswords()
{
	var password1 = document.getElementById('password');
	var password2 = document.getElementById('re password');
	var check = document.getElementById('check');
	if (password1.value != password2.value) {
		check.innerHTML = "<p>Le due password sono discordanti</p>";
	} else {
		check.innerHTML = "<p>Le due password sono uguali</p>";
	}
}