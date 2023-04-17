public class cpu {
    double price;
    public cpu(double p){
        price=p;
    }

    class processor{
        int core;
        String mf;
        public processor(int c, String manuf){
            core=c;
            mf=manuf;
        }
    }
    static class ram{
        int memory;
        String mft;
        public ram(int mem,String mnf){
            memory=mem;
            mft=mnf;
        }
    }


    public static void main(String []args){
        cpu hp = new cpu(12000);
        cpu.processor intel = hp.new processor(5,"intel");
        cpu.ram micron = new cpu.ram(10,"micron");
        System.out.println("Price : "+ hp.price);
        System.out.println("Processor Manufacturer : "+ intel.mf);
        System.out.println("No of Cores : "+ intel.core);
        System.out.println("Memory : "+ micron.memory);
        System.out.println("RAM Manufacturer : "+ micron.mft);
    }
}