package folder;

import folder.mappers.SimpleSourceDestinationMapper;

public class Main {
    public static void main(String[] args) {
        System.out.println(getSimpleDesc());
    }

    public static SimpleDestination getSimpleDesc() {
        SimpleSource simpleSource = new SimpleSource();
        simpleSource.setName("Niyaz");
        simpleSource.setAge(28);
        return SimpleSourceDestinationMapper.INSTANCE.sourceToDestination(simpleSource);
    }
}
