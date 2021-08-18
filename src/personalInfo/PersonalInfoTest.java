package personalInfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PersonalInfoTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		Class c1 = Class.forName("java.lang.String");
		Class c2 = Class.forName("java.lang.String");
	PersonalInfo personalInfo = (PersonalInfo)c1.newInstance();
	personalInfo.setName("KimHyerim");
	System.out.println(personalInfo);
	Class[]parameterType = {String.class};
	Constructor cons = c2.getConstructor(parameterType);
	Object[]inni= {"KimHyeJin"};
	PersonalInfo kimPersonalInfo = (PersonalInfo)cons.newInstance(inni);
	System.out.println(kimPersonalInfo);
	}

}
