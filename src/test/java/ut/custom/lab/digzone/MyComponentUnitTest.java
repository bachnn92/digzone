package ut.custom.lab.digzone;

import org.junit.Test;
import custom.lab.digzone.api.MyPluginComponent;
import custom.lab.digzone.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest {
    @Test
    public void testMyName() {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent", component.getName());
    }
}