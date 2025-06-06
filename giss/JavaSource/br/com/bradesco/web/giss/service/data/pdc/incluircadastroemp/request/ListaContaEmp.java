/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.incluircadastroemp.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ListaContaEmp.
 * 
 * @version $Revision$ $Date$
 */
public class ListaContaEmp implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _resumo
     */
    private int _resumo = 0;

    /**
     * keeps track of state for field: _resumo
     */
    private boolean _has_resumo;

    /**
     * Field _cosif
     */
    private long _cosif = 0;

    /**
     * keeps track of state for field: _cosif
     */
    private boolean _has_cosif;

    /**
     * Field _contaReceita
     */
    private long _contaReceita = 0;

    /**
     * keeps track of state for field: _contaReceita
     */
    private boolean _has_contaReceita;

    /**
     * Field _descContaReceita
     */
    private java.lang.String _descContaReceita;

    /**
     * Field _codItemServLC
     */
    private int _codItemServLC = 0;

    /**
     * keeps track of state for field: _codItemServLC
     */
    private boolean _has_codItemServLC;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaContaEmp() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluircadastroemp.request.ListaContaEmp()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodItemServLC
     * 
     */
    public void deleteCodItemServLC()
    {
        this._has_codItemServLC= false;
    } //-- void deleteCodItemServLC() 

    /**
     * Method deleteContaReceita
     * 
     */
    public void deleteContaReceita()
    {
        this._has_contaReceita= false;
    } //-- void deleteContaReceita() 

    /**
     * Method deleteCosif
     * 
     */
    public void deleteCosif()
    {
        this._has_cosif= false;
    } //-- void deleteCosif() 

    /**
     * Method deleteResumo
     * 
     */
    public void deleteResumo()
    {
        this._has_resumo= false;
    } //-- void deleteResumo() 

    /**
     * Returns the value of field 'codItemServLC'.
     * 
     * @return int
     * @return the value of field 'codItemServLC'.
     */
    public int getCodItemServLC()
    {
        return this._codItemServLC;
    } //-- int getCodItemServLC() 

    /**
     * Returns the value of field 'contaReceita'.
     * 
     * @return long
     * @return the value of field 'contaReceita'.
     */
    public long getContaReceita()
    {
        return this._contaReceita;
    } //-- long getContaReceita() 

    /**
     * Returns the value of field 'cosif'.
     * 
     * @return long
     * @return the value of field 'cosif'.
     */
    public long getCosif()
    {
        return this._cosif;
    } //-- long getCosif() 

    /**
     * Returns the value of field 'descContaReceita'.
     * 
     * @return String
     * @return the value of field 'descContaReceita'.
     */
    public java.lang.String getDescContaReceita()
    {
        return this._descContaReceita;
    } //-- java.lang.String getDescContaReceita() 

    /**
     * Returns the value of field 'resumo'.
     * 
     * @return int
     * @return the value of field 'resumo'.
     */
    public int getResumo()
    {
        return this._resumo;
    } //-- int getResumo() 

    /**
     * Method hasCodItemServLC
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodItemServLC()
    {
        return this._has_codItemServLC;
    } //-- boolean hasCodItemServLC() 

    /**
     * Method hasContaReceita
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasContaReceita()
    {
        return this._has_contaReceita;
    } //-- boolean hasContaReceita() 

    /**
     * Method hasCosif
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCosif()
    {
        return this._has_cosif;
    } //-- boolean hasCosif() 

    /**
     * Method hasResumo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasResumo()
    {
        return this._has_resumo;
    } //-- boolean hasResumo() 

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
     * Sets the value of field 'codItemServLC'.
     * 
     * @param codItemServLC the value of field 'codItemServLC'.
     */
    public void setCodItemServLC(int codItemServLC)
    {
        this._codItemServLC = codItemServLC;
        this._has_codItemServLC = true;
    } //-- void setCodItemServLC(int) 

    /**
     * Sets the value of field 'contaReceita'.
     * 
     * @param contaReceita the value of field 'contaReceita'.
     */
    public void setContaReceita(long contaReceita)
    {
        this._contaReceita = contaReceita;
        this._has_contaReceita = true;
    } //-- void setContaReceita(long) 

    /**
     * Sets the value of field 'cosif'.
     * 
     * @param cosif the value of field 'cosif'.
     */
    public void setCosif(long cosif)
    {
        this._cosif = cosif;
        this._has_cosif = true;
    } //-- void setCosif(long) 

    /**
     * Sets the value of field 'descContaReceita'.
     * 
     * @param descContaReceita the value of field 'descContaReceita'
     */
    public void setDescContaReceita(java.lang.String descContaReceita)
    {
        this._descContaReceita = descContaReceita;
    } //-- void setDescContaReceita(java.lang.String) 

    /**
     * Sets the value of field 'resumo'.
     * 
     * @param resumo the value of field 'resumo'.
     */
    public void setResumo(int resumo)
    {
        this._resumo = resumo;
        this._has_resumo = true;
    } //-- void setResumo(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaContaEmp
     */
    public static br.com.bradesco.web.giss.service.data.pdc.incluircadastroemp.request.ListaContaEmp unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.incluircadastroemp.request.ListaContaEmp) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.incluircadastroemp.request.ListaContaEmp.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluircadastroemp.request.ListaContaEmp unmarshal(java.io.Reader) 

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
