/* 
Copyright (C) 2000-2003 Greg Merrill (greghmerrill@yahoo.com)

This file is part of Follow (http://follow.sf.net).

Follow is free software; you can redistribute it and/or modify
it under the terms of version 2 of the GNU General Public
License as published by the Free Software Foundation.

Follow is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Follow; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

package ghm.followgui;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
@author <a href="mailto:greghmerrill@yahoo.com">Greg Merrill</a>
*/
class WhatIsThis extends JButton {
  
  WhatIsThis (
    final FollowApp app, 
    final String title, 
    final String text) 
  {
    super(getWhatIsThisIcon(app));
    setBorderPainted(false);
    setToolTipText(title);
    setMargin(new Insets(0, 0, 0, 0));
    addActionListener(new ActionListener () {
      public void actionPerformed (ActionEvent e) {
        JOptionPane.showMessageDialog(
          app.frame_,
          text,
          title,
          JOptionPane.INFORMATION_MESSAGE
        );
      }
    });
  }

  static Icon getWhatIsThisIcon (FollowApp app) {
    if (whatIsThisIcon == null) {
      whatIsThisIcon = new ImageIcon(app.getClass().getResource(
        app.resBundle_.getString("WhatIsThis.icon")
      ));
    }
    return whatIsThisIcon;
  }

  static Icon whatIsThisIcon;
  
}

