package Compiler;

import java.util.*;

public final class MapList {
    
    private ArrayList<HashMap<String,Object>> list = new ArrayList<HashMap<String,Object>>();
    
    public MapList create(HashMap<String,Object> microList) {
        list.add(microList);
        return this;
    }
    
    public MapList remove(int position) {
        list.remove(position);
        return this;
    }
    
    public MapList clear() {
        list = new ArrayList<HashMap<String,Object>>();
        return this;
    }
    
    public MapList NI() {
        return new MapList();
    }
    
    public MapList VIETI(MapList Instance) {
        return Instance;
    }
    
    public HashMap<String,Object> getHash(int position) {
        return (HashMap)list.get(position);
    }
    
    public Object getValueOfHash(HashMap<String,Object> hash, String key) {
        return hash.get(key);
    }
    
}
