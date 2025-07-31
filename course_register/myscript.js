function showCourses(){
    //alert("Thes are ur Courses")
    fetch("http://localhost:8080/courses")            //API end point
    .then((responce) => responce.json())
    .then((courses) => {
        const dataTable = document.getElementById("coursetable")
        courses.forEach(course =>{
            var row = `<tr>
            <td>${course.courseId}</td>
            <td>${course.courseName}</td>
            <td>${course.trainer}</td>
            <td>${course.durationInWeeks}</td>
            </tr>`

            dataTable.innerHTML+=row;
        })
    });


}
function showEnrolledStudents(){
    //alert("Thes are ur Courses")
    fetch("http://localhost:8080/courses/enrolled")            //API end point
    .then((responce) => responce.json()) //http responce inti json object
    .then((students) => {
        const dataTable = document.getElementById("enrolledtable")
        students.forEach(student =>{
            var row = `<tr>
            <td>${student.name}</td>
            <td>${student.emailId}</td>
            <td>${student.courseName}</td>
            </tr>`

            dataTable.innerHTML+=row;
        })
    });


}