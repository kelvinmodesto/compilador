/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class TCEnquanto extends Token
{
    public TCEnquanto()
    {
        super.setText("enquanto");
    }

    public TCEnquanto(int line, int pos)
    {
        super.setText("enquanto");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCEnquanto(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCEnquanto(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TCEnquanto text.");
    }
}
