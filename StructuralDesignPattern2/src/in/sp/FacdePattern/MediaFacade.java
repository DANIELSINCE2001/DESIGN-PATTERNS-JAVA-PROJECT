package in.sp.FacdePattern;


class MediaFacade 
{
 private PhotoLibrary photoLibrary;
 private VideoLibrary videoLibrary;

 public MediaFacade() 
 {
     this.photoLibrary = new PhotoLibrary();
     this.videoLibrary = new VideoLibrary();
 }

 public void loadMedia()
 {
     photoLibrary.loadPhotos();
     videoLibrary.loadVideos();
 }

 public void displayMedia() 
 {
     photoLibrary.displayPhotos();
     videoLibrary.playVideo("example.mp4");
 }

 public void deleteMedia(String photoName, String videoName) 
 {
     photoLibrary.deletePhoto(photoName);
     videoLibrary.deleteVideo(videoName);
 }
}

