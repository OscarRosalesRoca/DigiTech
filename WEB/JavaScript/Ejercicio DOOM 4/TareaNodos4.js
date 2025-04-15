const smallImages = document.querySelectorAll("#SmallPictureContainer .img img"); 
const bigImage = document.getElementById("BigPicture"); 

smallImages.forEach((img) => {
    img.addEventListener("mouseover", function () {
        bigImage.src = img.src; 
    });
});