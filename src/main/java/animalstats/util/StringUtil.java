package animalstats.util;

import java.util.function.Function;
import java.util.function.Predicate;

public class StringUtil {
	
	public static Function<String, String> removeLineEndChars = s -> s.replaceAll("\\r\\n", "");
	public static Predicate<String> cannotDo = str -> str.contains("not") || str.isEmpty() || str.contains("don't"); 
}
