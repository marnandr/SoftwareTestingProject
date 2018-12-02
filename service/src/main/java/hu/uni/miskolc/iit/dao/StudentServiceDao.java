package hu.uni.miskolc.iit.dao;

import hu.uni.miskolc.iit.exceptions.RequestDoesNotExistException;
import hu.uni.miskolc.iit.model.Course;
import hu.uni.miskolc.iit.model.Form;

import java.util.List;

public interface StudentServiceDao {

    public List<Course> findAllCourses();

    public List<Form>   findAllForms();

    public boolean checkRequestStatus(int requestid, boolean status) throws RequestDoesNotExistException;

    public boolean createComplain(int complainID, int requestID, String complain);
}