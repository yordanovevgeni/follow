// Copyright (C) 2000 Greg Merrill (greghmerrill@yahoo.com)
// Distributed under the terms of the GNU General Public License (version 2)
// For details on the GNU GPL, please visit http://www.gnu.org/copyleft/gpl.html
// To find out more about this and other free software by Greg Merrill, 
//  please visit http://gregmerrill.imagineis.com

package ghm.followgui;

import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

/**
Base class for all actions in the Follow application.
@author <a href="mailto:greghmerrill@yahoo.com">Greg Merrill</a>
*/
abstract class FollowAppAction extends AbstractAction {

  FollowAppAction (
    FollowApp app, 
    String name, 
    String mnemonic,
    String accelerator
  ) {
    super(name);
    init(app, mnemonic, accelerator);
  }
  
  FollowAppAction (
    FollowApp app, 
    String name, 
    String mnemonic,
    String accelerator,
    String iconName
  ) {
    super(name, new ImageIcon(app.getClass().getResource(iconName)));
    init(app, mnemonic, accelerator);
  }
  
  private void init (FollowApp app, String mnemonic, String accelerator) {
    app_ = app;
    setMnemonic(mnemonic);
    setAccelerator(
      KeyStroke.getKeyStroke(accelerator.charAt(0), KeyEvent.CTRL_MASK)
    );
  }
  
  char getMnemonic () { return mnemonic_; }
  void setMnemonic (char mnemonic) { mnemonic_ = mnemonic; }
  void setMnemonic (String mnemonic) {
    mnemonic_ = mnemonic.charAt(0);
  }
  
  KeyStroke getAccelerator () { return accelerator_; }
  void setAccelerator (KeyStroke accelerator) { accelerator_ = accelerator; }  
  
  FollowApp app_;
  char mnemonic_;
  KeyStroke accelerator_;
  
}
