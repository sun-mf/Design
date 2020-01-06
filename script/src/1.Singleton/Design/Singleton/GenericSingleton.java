package Design.Singleton;

import java.util.*;


public class GenericSingleton{
	
	private static Map<Class<? extends GenericSingleton>, GenericSingleton> map = new HashMap<>();
	
	public static <E extends GenericSingleton> GenericSingleton getInstance(Class<E> singleType){
		if(map.containsKey(singleType)){
			return map.get(singleType);
		}else{
			E single = null;
			try {
				single = singleType.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			map.put(singleType, single);
			return single;
		}	
	}
	
//	protected GenericSingleton(){
//		System.out.println("create instance");
//	}
//	
	public static void main(String[] args){	
		GenericSingleton.getInstance(GenericSingleton.class);
	}
}

