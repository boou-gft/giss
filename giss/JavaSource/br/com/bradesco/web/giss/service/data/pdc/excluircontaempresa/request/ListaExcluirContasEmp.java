/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaExcluirContasEmp.java,v 1.3 2017/11/16 20:32:07 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request;

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
 * Class ListaExcluirContasEmp.
 * 
 * @version $Revision: 1.3 $ $Date: 2017/11/16 20:32:07 $
 */
public class ListaExcluirContasEmp implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codEmpresa
     */
    private int _codEmpresa = 0;

    /**
     * keeps track of state for field: _codEmpresa
     */
    private boolean _has_codEmpresa;

    /**
     * Field _resumo
     */
    private int _resumo = 0;

    /**
     * keeps track of state for field: _resumo
     */
    private boolean _has_resumo;

    /**
     * Field _contaReceita
     */
    private long _contaReceita = 0;

    /**
     * keeps track of state for field: _contaReceita
     */
    private boolean _has_contaReceita;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaExcluirContasEmp() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodEmpresa
     * 
     */
    public void deleteCodEmpresa()
    {
        this._has_codEmpresa= false;
    } //-- void deleteCodEmpresa() 

    /**
     * Method deleteContaReceita
     * 
     */
    public void deleteContaReceita()
    {
        this._has_contaReceita= false;
    } //-- void deleteContaReceita() 

    /**
     * Method deleteResumo
     * 
     */
    public void deleteResumo()
    {
        this._has_resumo= false;
    } //-- void deleteResumo() 

    /**
     * Returns the value of field 'codEmpresa'.
     * 
     * @return int
     * @return the value of field 'codEmpresa'.
     */
    public int getCodEmpresa()
    {
        return this._codEmpresa;
    } //-- int getCodEmpresa() 

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
     * Method hasCodEmpresa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodEmpresa()
    {
        return this._has_codEmpresa;
    } //-- boolean hasCodEmpresa() 

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
     * Sets the value of field 'codEmpresa'.
     * 
     * @param codEmpresa the value of field 'codEmpresa'.
     */
    public void setCodEmpresa(int codEmpresa)
    {
        this._codEmpresa = codEmpresa;
        this._has_codEmpresa = true;
    } //-- void setCodEmpresa(int) 

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
     * @return ListaExcluirContasEmp
     */
    public static br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.request.ListaExcluirContasEmp unmarshal(java.io.Reader) 

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
