package jabberpoint.model.style;

import java.util.HashMap;
import java.util.Map;

/**
 * Factory that, on initialization, constructs the available {@link BitmapStyle} objects
 */
public class BitmapStyleFactory extends StyleFactory {

    BitmapStyleFactory() {
        styles = new HashMap<Integer, Style>();
        styles.put(1, new BitmapStyle(1, 1));
    }

}
