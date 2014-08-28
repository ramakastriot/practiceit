public class FilteredAccount extends Account {
    int total = 0;
    int zero = 0;
    public FilteredAccount(Client c) {
        super(c);
    }
    
    public boolean process(Transaction t) {
        total++;
        
        if(t.value() == 0) {
            zero++;
            return true;
        }
        
        return super.process(t);
    }
    
    public double percentFiltered() {
        if(total == 0)
            return 0.0;
        
        return ((double) zero) * 100 / total;
    }
}
