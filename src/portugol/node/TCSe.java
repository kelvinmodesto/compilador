/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class TCSe extends Token
{
    public TCSe()
    {
        super.setText("se");
    }

    public TCSe(int line, int pos)
    {
        super.setText("se");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCSe(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCSe(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TCSe text.");
    }
}
