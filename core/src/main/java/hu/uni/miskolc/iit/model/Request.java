package hu.uni.miskolc.iit.model;
import java.util.Date;
public class Request{


    private int request_id;
    private int student_id;
    private Date request_date;
    private int teacher_id;
    private String request_status;
    private String description;
    private int course_id;
    private int form_id;
    private boolean complainflag=true;
    public Request() {
    }

    public Request(int request_id, int student_id, Date request_date, int teacher_id, String request_status, String description, boolean complainflag) {
        this.request_id = request_id;
        this.student_id = student_id;
        this.request_date = request_date;
        this.teacher_id = teacher_id;
        this.request_status = request_status;
        this.description = description;
        this.complainflag = complainflag;
    }
    public boolean getComplainFlag(){return complainflag;}

    public void setComplainFlag(boolean complainflag){this.complainflag=complainflag;}

    public int getRequestID() {
        return request_id;
    }

    public void setRequestID(int request_id) {
        this.request_id = request_id;
    }

    public int getStudentID() {
        return student_id;
    }

    public void setStudentID(int student_id) {
        this.student_id = student_id;
    }

    public Date getRequestDate() {
        return request_date;
    }

    public void setRequestDate(Date request_date) {
        this.request_date = request_date;
    }

    public int getTeacherID() {
        return teacher_id;
    }

    public void setTeacherID(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getRequestStatus(){
        return request_status;
    }

    public void setRequestStatus(String requeststatus){
        this.request_status=request_status;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description= this.description;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourseID(int course_id) {
        this.course_id = course_id;
    }

    public int getFormID() {
        return form_id;
    }

    public void setFormID(int form_id) {
        this.form_id = form_id;
    }
}
