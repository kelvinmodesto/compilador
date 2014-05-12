/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class ALeiaComando extends PComando
{
    private PLeia _leia_;

    public ALeiaComando()
    {
        // Constructor
    }

    public ALeiaComando(
        @SuppressWarnings("hiding") PLeia _leia_)
    {
        // Constructor
        setLeia(_leia_);

    }

    @Override
    public Object clone()
    {
        return new ALeiaComando(
            cloneNode(this._leia_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALeiaComando(this);
    }

    public PLeia getLeia()
    {
        return this._leia_;
    }

    public void setLeia(PLeia node)
    {
        if(this._leia_ != null)
        {
            this._leia_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._leia_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._leia_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._leia_ == child)
        {
            this._leia_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._leia_ == oldChild)
        {
            setLeia((PLeia) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}