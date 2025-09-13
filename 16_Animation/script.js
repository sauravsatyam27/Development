
const cursor = document.querySelector(".cursor");

document.addEventListener("mousemove", (e) => {
  cursor.style.left = e.pageX + "px";
  cursor.style.top = e.pageY + "px";
});

// Optional: click effect (pulse)
document.addEventListener("click", () => {
  cursor.style.transform += " scale(1.5)";
  setTimeout(() => {
    cursor.style.transform = cursor.style.transform.replace(" scale(1.5)", "");
  }, 150);
});
