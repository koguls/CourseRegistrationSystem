function showcourse(){
     fetch("http://localhost:8080/courses")
    .then((response) => response.json())
    .then((courses) => {
        const dataTable = document.getElementById("coursetable")

        courses.forEach(course => {
            var row =`<tr>
            <td>${course.courseId}</td>
            <td>${course.courseName}</td>
            <td>${course.trainer}</td>
            <td>${course.durationInWeeks}</td>
            </tr>`

            dataTable.innerHTML+=row;
        });
    }); 
}

function showcStudentall(){
    fetch("http://localhost:8080/courses/entrolled")
    .then((response) => response.json())
    .then((student) => {

        const dataTable = document.getElementById("Studentenrolledtable")

        student.forEach(std =>{
            var row =`<tr>
                <td>${std.name}</td>   
                <td>${std.emailId}</td> 
                <td>${std.courseName}</td> 
            </tr>`

            dataTable.innerHTML+=row;
        });
    });
}

