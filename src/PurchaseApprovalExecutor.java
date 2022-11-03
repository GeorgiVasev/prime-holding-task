import common.Type;
import handlers.Approver;
import handlers.Manager;

/**
 * Execution class of the application.
 * Be free to modify below line 14 (bellow comment line)
 */
public class PurchaseApprovalExecutor {

    public static void execute() {
        Approver manager = new Manager();
        ApprovalChainGenerator.generate(manager);
        //Be free to modify method below this line

        manager.approve(1, 300, Type.CONSUMABLES);
        manager.approve(2, 1000, Type.CLERICAL);
        manager.approve(3, 2000, Type.GADGETS);
        manager.approve(4, 5000, Type.GAMING);
        manager.approve(5, 9000, Type.PC);
    }
}
