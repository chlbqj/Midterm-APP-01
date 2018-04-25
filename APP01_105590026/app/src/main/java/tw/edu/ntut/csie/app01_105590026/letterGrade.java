package tw.edu.ntut.csie.app01_105590026;

/**
 * Created by NTUTCSIE on 2018/4/25.
 */

public class letterGrade {
    public String letterGrade(int score){
        String a = "等第：";
        if(score>100) {
            a+="grade='X'";
            return a;
        }
        else if(score>=90 && score <=100){
            a+="grade='A'";
            return a;
        }
        else if(score >=80 && score <=89){
            a+="grade='B'";
            return a;
        }
        else if(score >=70 && score <=79){
            a+="grade='C'";
            return a;
        }
        else if(score >=60 && score <=69){
            a+="grade='D'";
            return a;
        }
        else if(score >=0 && score <=59){
            a+="grade='F'";
            return a;
        }
        else if(score <0){
            a+="grade='X'";
            return a;
        }
        else {
            return "error";
        }
    }
}
