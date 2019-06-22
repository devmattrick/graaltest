package cx.matthew.graaltest;

import org.bukkit.plugin.java.JavaPlugin;
import org.graalvm.polyglot.Context;

public class GraalTestPlugin extends JavaPlugin {

  @Override
  public void onEnable() {
    Context context = Context.create();
    context.eval("js", "console.log(\"hi!!!\");");
  }

}
