package FusionDeveloper.jquery.bean;

import javax.faces.context.FacesContext;
import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;
import javax.faces.event.ActionEvent;


public class ShowJqNotification {
    public ShowJqNotification() {
    }

    /**Helper method to execute javascript
     * @param script
     */
    public void calljqHelper(String script) {
        FacesContext context = FacesContext.getCurrentInstance();
        ExtendedRenderKitService erks = Service.getService(context.getRenderKit(), ExtendedRenderKitService.class);
        erks.addScript(context, script);
    }

    /**Method to invoke Error Message
     * @param actionEvent
     */
    public void showErrMessageAction(ActionEvent actionEvent) {
        calljqHelper("$.growl.error({ message: \"Hi this is error message!!! This message is too long to read, Just read it and see how it looks\" });");

    }

    /**Method to invoke Warnign Message
     * @param actionEvent
     */
    public void showWarningMessageAction(ActionEvent actionEvent) {
        calljqHelper("$.growl.warning({ message: \"Hi this is Warning! This message is too long to read, Just read it and see how it looks\" });");
    }

    /**Method to invoke Info Message
     * @param actionEvent
     */
    public void showNoticeMessageAction(ActionEvent actionEvent) {
        calljqHelper("$.growl.notice({ message: \"Hi this is Notice! This message is too long to read, Just read it and see how it looks\" });");
    }

}
