function over(arg) {
  arg.src = "./images/dog.png";
  arg.width = arg.width * 1.2;
  console.log("현재 이미지의 크기는 " + arg.width);
}
function out(arg) {
  arg.src = "./images/dog-photoaidcom-greyscale.png";
  arg.width = (arg.width * 10) / 12;
  console.log("현재 이미지의 크기는 " + arg.width);
}
function clck(arg) {
  arg.width = "1000";
}
function dbclck(arg) {
  arg.width = "600";
}
