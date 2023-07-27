package demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Doctor implements Staff {
    @Autowired
    private Nurse nurse;

    private String qualification;

//    public Doctor(Nurse nurse, String qualification) {
//        this.nurse = nurse;
//        this.qualification = qualification;
//    }
//
//    public Doctor(Nurse nurse) {
//        this.nurse = nurse;
//    }

    @Override

    public void assist() {
        System.out.println("Doctor is assisting");
//        nurse.assist();
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "nurse=" + nurse +
                ", qualification='" + qualification + '\'' +
                '}';
    }

}
