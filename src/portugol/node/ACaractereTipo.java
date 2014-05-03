/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class ACaractereTipo extends PTipo
{
    private TCCaractere _cCaractere_;

    public ACaractereTipo()
    {
        // Constructor
    }

    public ACaractereTipo(
        @SuppressWarnings("hiding") TCCaractere _cCaractere_)
    {
        // Constructor
        setCCaractere(_cCaractere_);

    }

    @Override
    public Object clone()
    {
        return new ACaractereTipo(
            cloneNode(this._cCaractere_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACaractereTipo(this);
    }

    public TCCaractere getCCaractere()
    {
        return this._cCaractere_;
    }

    public void setCCaractere(TCCaractere node)
    {
        if(this._cCaractere_ != null)
        {
            this._cCaractere_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cCaractere_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._cCaractere_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._cCaractere_ == child)
        {
            this._cCaractere_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._cCaractere_ == oldChild)
        {
            setCCaractere((TCCaractere) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
