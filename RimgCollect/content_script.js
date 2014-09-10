/** imgCollect for reddit: Collect all images in a comment thread and display at top
 * Currently finding images tagged with type= "IMAGE"
 */
var regExp = new RegExp(/^img[a-z]*$/);
function imgCollect() {
	this.getPictures = function() {
		var listOfPictures = [];
		var listOfAnchors = document.getElementsByTagName('a');
		for (var i = 0; i < listOfAnchors.length; i++) {
			if (listOfAnchors[i].type == "IMAGE") {
					listOfPictures.push(listOfAnchors[i]);
			}
		}
		
		return listOfPictures;
	};
	
	this.pictures = this.getPictures();
	
	this.requestPictures = function() {
		for (var i = 0; i < this.pictures.length; i++) {
			console.log(i);
			var brk = document.createElement('div')
			var anchor = document.createElement('a');
			var link = this.pictures[i].href;
			anchor.textContent = this.pictures[i].textContent;
			anchor.setAttribute('href',link);
			document.getElementById('header').appendChild(brk)
		    document.getElementById('header').appendChild(anchor);
		    ;
		}
		
	  };
};

var images = new imgCollect();
images.requestPictures();
