/* 
 * Copyright (C) 2000-2003 Greg Merrill (greghmerrill@yahoo.com)
 * 
 * This file is part of Follow (http://follow.sf.net).
 * 
 * Follow is free software; you can redistribute it and/or modify
 * it under the terms of version 2 of the GNU General Public
 * License as published by the Free Software Foundation.
 * 
 * Follow is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Follow; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package ghm.followgui;

import java.awt.event.ActionEvent;


/**
 * Perform an action for debugging.
 * 
 * @author <a href="mailto:greghmerrill@yahoo.com">Greg Merrill</a>
 * @author Murali Krishnan
 */
class Debug extends FollowAppAction {
  
  Debug (FollowApp app) {
    super(app, "Debug", "U", "U");
  }

  public void actionPerformed (ActionEvent e) {
    System.out.println("Debug action.");    
  }

}
