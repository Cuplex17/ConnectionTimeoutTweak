package cuplex.ctot;

import org.apache.commons.lang3.StringUtils;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

public abstract class Patch
{

    public abstract boolean apply(ClassNode node);

    public static MethodNode findMethod(ClassNode node, String name) {
        return findMethod(node, name, name);
    }

    public static MethodNode findMethod(ClassNode node, String name, String srgName) {
        //name = getName(name, srgName);
        name = "func_176102_a";

        for(MethodNode method : node.methods) {
            if(name.equals(method.name)) {
                CTOTMain.logger.debug("Patching method: " + method.name);
                return method;
            }
        }

        return null;
    }
/*
    public static String getName(String name, String srgName) {
        return CTOTMain.IS_DEOBFUSCATED ? name : srgName;
    }
*/
    public static String getName(Class<?> clazz) {
        return StringUtils.replaceChars(clazz.getName(), '.', '/');
    }

}
