import com.fang.text.Play;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by FangYongYao on 2019/4/20.
 */
@RunWith(JUnit4.class)
public class test {

    @Test
    public void test1(){
        Play play=new Play(3,5);
        play.play(100);
    }
    @Test
    public void test2(){
        Play play=new Play(3,5);
        play.play2(100);
    }

}
