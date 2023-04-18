

package com.mycompany.idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

    private void btClickActionPerformed(java.awt.event.ActionEvent evt) {                                        
        Locale loc = Locale.getDefault();
        lbIdioma.setText(loc.getDisplayLanguage());
}
