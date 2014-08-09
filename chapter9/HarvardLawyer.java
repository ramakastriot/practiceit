/* Write a class HarvardLawyer to accompany the other law firm classes 
 * described in this chapter. Harvard lawyers are like normal lawyers, but 
 * they make 20% more money than a normal lawyer, they get 3 days more 
 * vacation, and they have to fill out four of the lawyer's forms to go on 
 * vacation.
 */
public class HarvardLawyer extends Lawyer {
    public double getSalary() {
        return 1.2 * super.getSalary();
    }
    
    public int getVacationDays() {
        return super.getVacationDays() + 3;
    }
    
    public String getVacationForm() {
        String form = super.getVacationForm();
        return form + form + form + form;
    }
}
