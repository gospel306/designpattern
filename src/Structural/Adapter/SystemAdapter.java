package Structural.Adapter;

public class SystemAdapter implements Computer{
    AMD amd;

    public SystemAdapter(AMD amd){
        this.amd = amd;
    }

    @Override
    public void keyboard() {
        amd.Cpu();
    }

    @Override
    public void mouse() {
        amd.Gpu();
    }
}
