package proxy;

public class HelloImpl implements Hello {

	@Override
	public void say(String name) {
		System.out.println("name:"+name);
	}

}
