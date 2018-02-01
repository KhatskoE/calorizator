package test.calorizator;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class App
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class);
    	// new SpringApplicationBuilder(App.class).run(args);
    }

	/*public void run(String... arg0) throws Exception {
		if (arg0 == null || arg0.length < 1) {
			System.out.println(EMPRY_ARGUMENT);
		}
		
		Arrays.stream(arg0).forEach(o -> System.out.println(o));
		
		
	}*/
}
