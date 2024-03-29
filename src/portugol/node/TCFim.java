/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class TCFim extends Token
{
    public TCFim()
    {
        super.setText("fim");
    }

    public TCFim(int line, int pos)
    {
        super.setText("fim");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCFim(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCFim(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TCFim text.");
    }
}
