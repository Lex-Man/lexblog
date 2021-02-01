var article = 0;

function newPopup(url, id) {
	var pubWindow = window.open(
		url,'popUpWindow','height=300,width=400,left=10,top=10,resizable=yes,scrollbars=yes,toolbar=yes,menubar=no,location=no,directories=no,status=yes')

    pubWindow.addEventListener('load', function(){
                  pubWindow.setArticle(id);
                }, true);
}

function setArticle(id) {
    article = id;
    document.getElementById("id").innerHTML = article;
}

function publish(){

    var json = {};


    var request = new XMLHttpRequest()

}