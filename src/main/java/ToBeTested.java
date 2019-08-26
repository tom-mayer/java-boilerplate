public class ToBeTested {

    private Dependency dep;

    ToBeTested(Dependency dep){
        this.dep = dep;
    }

    public String doSomething() {
        return this.dep.getSomething();
    }

}
