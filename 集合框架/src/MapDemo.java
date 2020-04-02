import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get("作者"));
        System.out.println(map.getOrDefault("作者","佚名"));
        System.out.println(map.containsKey("作者"));
        System.out.println(map.containsValue("佚名"));
        map.put("作者","鲁迅");
        map.put("标题","狂人日记");
        map.put("发表时间","1918年");
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get("作者"));
        System.out.println(map.getOrDefault("作者","佚名"));
        System.out.println(map.containsValue("佚名"));
        System.out.println(map.containsKey("作者"));

        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Set<String> stirngs=map.keySet();
        for(String key:stirngs){
            String value=map.get(key);
            System.out.println(key+" "+value);
        }

    }
}
