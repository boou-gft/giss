/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: OcorrenciasAliqDif.java,v 1.1 2017/04/11 14:09:31 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listacontasmunaliqdif.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class OcorrenciasAliqDif.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:09:31 $
 */
public class OcorrenciasAliqDif implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _conta
     */
    private long _conta = 0;

    /**
     * keeps track of state for field: _conta
     */
    private boolean _has_conta;

    /**
     * Field _descConta
     */
    private java.lang.String _descConta;

    /**
     * Field _itemLei
     */
    private int _itemLei = 0;

    /**
     * keeps track of state for field: _itemLei
     */
    private boolean _has_itemLei;

    /**
     * Field _aliqPadrao
     */
    private double _aliqPadrao = 0;

    /**
     * keeps track of state for field: _aliqPadrao
     */
    private boolean _has_aliqPadrao;

    /**
     * Field _aliqDiferec
     */
    private double _aliqDiferec = 0;

    /**
     * keeps track of state for field: _aliqDiferec
     */
    private boolean _has_aliqDiferec;


      //----------------/
     //- Constructors -/
    //----------------/

    public OcorrenciasAliqDif() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listacontasmunaliqdif.response.OcorrenciasAliqDif()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAliqDiferec
     * 
     */
    public void deleteAliqDiferec()
    {
        this._has_aliqDiferec= false;
    } //-- void deleteAliqDiferec() 

    /**
     * Method deleteAliqPadrao
     * 
     */
    public void deleteAliqPadrao()
    {
        this._has_aliqPadrao= false;
    } //-- void deleteAliqPadrao() 

    /**
     * Method deleteConta
     * 
     */
    public void deleteConta()
    {
        this._has_conta= false;
    } //-- void deleteConta() 

    /**
     * Method deleteItemLei
     * 
     */
    public void deleteItemLei()
    {
        this._has_itemLei= false;
    } //-- void deleteItemLei() 

    /**
     * Returns the value of field 'aliqDiferec'.
     * 
     * @return double
     * @return the value of field 'aliqDiferec'.
     */
    public double getAliqDiferec()
    {
        return this._aliqDiferec;
    } //-- double getAliqDiferec() 

    /**
     * Returns the value of field 'aliqPadrao'.
     * 
     * @return double
     * @return the value of field 'aliqPadrao'.
     */
    public double getAliqPadrao()
    {
        return this._aliqPadrao;
    } //-- double getAliqPadrao() 

    /**
     * Returns the value of field 'conta'.
     * 
     * @return long
     * @return the value of field 'conta'.
     */
    public long getConta()
    {
        return this._conta;
    } //-- long getConta() 

    /**
     * Returns the value of field 'descConta'.
     * 
     * @return String
     * @return the value of field 'descConta'.
     */
    public java.lang.String getDescConta()
    {
        return this._descConta;
    } //-- java.lang.String getDescConta() 

    /**
     * Returns the value of field 'itemLei'.
     * 
     * @return int
     * @return the value of field 'itemLei'.
     */
    public int getItemLei()
    {
        return this._itemLei;
    } //-- int getItemLei() 

    /**
     * Method hasAliqDiferec
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAliqDiferec()
    {
        return this._has_aliqDiferec;
    } //-- boolean hasAliqDiferec() 

    /**
     * Method hasAliqPadrao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAliqPadrao()
    {
        return this._has_aliqPadrao;
    } //-- boolean hasAliqPadrao() 

    /**
     * Method hasConta
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasConta()
    {
        return this._has_conta;
    } //-- boolean hasConta() 

    /**
     * Method hasItemLei
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasItemLei()
    {
        return this._has_itemLei;
    } //-- boolean hasItemLei() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'aliqDiferec'.
     * 
     * @param aliqDiferec the value of field 'aliqDiferec'.
     */
    public void setAliqDiferec(double aliqDiferec)
    {
        this._aliqDiferec = aliqDiferec;
        this._has_aliqDiferec = true;
    } //-- void setAliqDiferec(double) 

    /**
     * Sets the value of field 'aliqPadrao'.
     * 
     * @param aliqPadrao the value of field 'aliqPadrao'.
     */
    public void setAliqPadrao(double aliqPadrao)
    {
        this._aliqPadrao = aliqPadrao;
        this._has_aliqPadrao = true;
    } //-- void setAliqPadrao(double) 

    /**
     * Sets the value of field 'conta'.
     * 
     * @param conta the value of field 'conta'.
     */
    public void setConta(long conta)
    {
        this._conta = conta;
        this._has_conta = true;
    } //-- void setConta(long) 

    /**
     * Sets the value of field 'descConta'.
     * 
     * @param descConta the value of field 'descConta'.
     */
    public void setDescConta(java.lang.String descConta)
    {
        this._descConta = descConta;
    } //-- void setDescConta(java.lang.String) 

    /**
     * Sets the value of field 'itemLei'.
     * 
     * @param itemLei the value of field 'itemLei'.
     */
    public void setItemLei(int itemLei)
    {
        this._itemLei = itemLei;
        this._has_itemLei = true;
    } //-- void setItemLei(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return OcorrenciasAliqDif
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listacontasmunaliqdif.response.OcorrenciasAliqDif unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listacontasmunaliqdif.response.OcorrenciasAliqDif) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listacontasmunaliqdif.response.OcorrenciasAliqDif.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listacontasmunaliqdif.response.OcorrenciasAliqDif unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
