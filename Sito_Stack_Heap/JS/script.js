function changeTheme()
{
    var theme = document.getElementById("theme");
    if (theme.getAttribute("href") == "css/light.css")
    {
        theme.href = "css/dark.css";
    }
    else
    {
        theme.href = "css/light.css";
    }
}