/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response;

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
 * Class ListaContaContabilTipoServico.
 * 
 * @version $Revision$ $Date$
 */
public class ListaContaContabilTipoServico implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codTipoServico
     */
    private int _codTipoServico = 0;

    /**
     * keeps track of state for field: _codTipoServico
     */
    private boolean _has_codTipoServico;

    /**
     * Field _cosif
     */
    private java.lang.String _cosif;

    /**
     * Field _codGrupo
     */
    private int _codGrupo = 0;

    /**
     * keeps track of state for field: _codGrupo
     */
    private boolean _has_codGrupo;

    /**
     * Field _codSubGrupo
     */
    private int _codSubGrupo = 0;

    /**
     * keeps track of state for field: _codSubGrupo
     */
    private boolean _has_codSubGrupo;

    /**
     * Field _hrManutencaoRegistro
     */
    private java.lang.String _hrManutencaoRegistro;

    /**
     * Field _codItemLeiCompl
     */
    private int _codItemLeiCompl = 0;

    /**
     * keeps track of state for field: _codItemLeiCompl
     */
    private boolean _has_codItemLeiCompl;

    /**
     * Field _nomeRazao
     */
    private java.lang.String _nomeRazao;

    /**
     * Field _numConta
     */
    private int _numConta = 0;

    /**
     * keeps track of state for field: _numConta
     */
    private boolean _has_numConta;

    /**
     * Field _digConta
     */
    private java.lang.String _digConta;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaContaContabilTipoServico() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodGrupo
     * 
     */
    public void deleteCodGrupo()
    {
        this._has_codGrupo= false;
    } //-- void deleteCodGrupo() 

    /**
     * Method deleteCodItemLeiCompl
     * 
     */
    public void deleteCodItemLeiCompl()
    {
        this._has_codItemLeiCompl= false;
    } //-- void deleteCodItemLeiCompl() 

    /**
     * Method deleteCodSubGrupo
     * 
     */
    public void deleteCodSubGrupo()
    {
        this._has_codSubGrupo= false;
    } //-- void deleteCodSubGrupo() 

    /**
     * Method deleteCodTipoServico
     * 
     */
    public void deleteCodTipoServico()
    {
        this._has_codTipoServico= false;
    } //-- void deleteCodTipoServico() 

    /**
     * Method deleteNumConta
     * 
     */
    public void deleteNumConta()
    {
        this._has_numConta= false;
    } //-- void deleteNumConta() 

    /**
     * Returns the value of field 'codGrupo'.
     * 
     * @return int
     * @return the value of field 'codGrupo'.
     */
    public int getCodGrupo()
    {
        return this._codGrupo;
    } //-- int getCodGrupo() 

    /**
     * Returns the value of field 'codItemLeiCompl'.
     * 
     * @return int
     * @return the value of field 'codItemLeiCompl'.
     */
    public int getCodItemLeiCompl()
    {
        return this._codItemLeiCompl;
    } //-- int getCodItemLeiCompl() 

    /**
     * Returns the value of field 'codSubGrupo'.
     * 
     * @return int
     * @return the value of field 'codSubGrupo'.
     */
    public int getCodSubGrupo()
    {
        return this._codSubGrupo;
    } //-- int getCodSubGrupo() 

    /**
     * Returns the value of field 'codTipoServico'.
     * 
     * @return int
     * @return the value of field 'codTipoServico'.
     */
    public int getCodTipoServico()
    {
        return this._codTipoServico;
    } //-- int getCodTipoServico() 

    /**
     * Returns the value of field 'cosif'.
     * 
     * @return String
     * @return the value of field 'cosif'.
     */
    public java.lang.String getCosif()
    {
        return this._cosif;
    } //-- java.lang.String getCosif() 

    /**
     * Returns the value of field 'digConta'.
     * 
     * @return String
     * @return the value of field 'digConta'.
     */
    public java.lang.String getDigConta()
    {
        return this._digConta;
    } //-- java.lang.String getDigConta() 

    /**
     * Returns the value of field 'hrManutencaoRegistro'.
     * 
     * @return String
     * @return the value of field 'hrManutencaoRegistro'.
     */
    public java.lang.String getHrManutencaoRegistro()
    {
        return this._hrManutencaoRegistro;
    } //-- java.lang.String getHrManutencaoRegistro() 

    /**
     * Returns the value of field 'nomeRazao'.
     * 
     * @return String
     * @return the value of field 'nomeRazao'.
     */
    public java.lang.String getNomeRazao()
    {
        return this._nomeRazao;
    } //-- java.lang.String getNomeRazao() 

    /**
     * Returns the value of field 'numConta'.
     * 
     * @return int
     * @return the value of field 'numConta'.
     */
    public int getNumConta()
    {
        return this._numConta;
    } //-- int getNumConta() 

    /**
     * Method hasCodGrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodGrupo()
    {
        return this._has_codGrupo;
    } //-- boolean hasCodGrupo() 

    /**
     * Method hasCodItemLeiCompl
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodItemLeiCompl()
    {
        return this._has_codItemLeiCompl;
    } //-- boolean hasCodItemLeiCompl() 

    /**
     * Method hasCodSubGrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodSubGrupo()
    {
        return this._has_codSubGrupo;
    } //-- boolean hasCodSubGrupo() 

    /**
     * Method hasCodTipoServico
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodTipoServico()
    {
        return this._has_codTipoServico;
    } //-- boolean hasCodTipoServico() 

    /**
     * Method hasNumConta
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumConta()
    {
        return this._has_numConta;
    } //-- boolean hasNumConta() 

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
     * Sets the value of field 'codGrupo'.
     * 
     * @param codGrupo the value of field 'codGrupo'.
     */
    public void setCodGrupo(int codGrupo)
    {
        this._codGrupo = codGrupo;
        this._has_codGrupo = true;
    } //-- void setCodGrupo(int) 

    /**
     * Sets the value of field 'codItemLeiCompl'.
     * 
     * @param codItemLeiCompl the value of field 'codItemLeiCompl'.
     */
    public void setCodItemLeiCompl(int codItemLeiCompl)
    {
        this._codItemLeiCompl = codItemLeiCompl;
        this._has_codItemLeiCompl = true;
    } //-- void setCodItemLeiCompl(int) 

    /**
     * Sets the value of field 'codSubGrupo'.
     * 
     * @param codSubGrupo the value of field 'codSubGrupo'.
     */
    public void setCodSubGrupo(int codSubGrupo)
    {
        this._codSubGrupo = codSubGrupo;
        this._has_codSubGrupo = true;
    } //-- void setCodSubGrupo(int) 

    /**
     * Sets the value of field 'codTipoServico'.
     * 
     * @param codTipoServico the value of field 'codTipoServico'.
     */
    public void setCodTipoServico(int codTipoServico)
    {
        this._codTipoServico = codTipoServico;
        this._has_codTipoServico = true;
    } //-- void setCodTipoServico(int) 

    /**
     * Sets the value of field 'cosif'.
     * 
     * @param cosif the value of field 'cosif'.
     */
    public void setCosif(java.lang.String cosif)
    {
        this._cosif = cosif;
    } //-- void setCosif(java.lang.String) 

    /**
     * Sets the value of field 'digConta'.
     * 
     * @param digConta the value of field 'digConta'.
     */
    public void setDigConta(java.lang.String digConta)
    {
        this._digConta = digConta;
    } //-- void setDigConta(java.lang.String) 

    /**
     * Sets the value of field 'hrManutencaoRegistro'.
     * 
     * @param hrManutencaoRegistro the value of field
     * 'hrManutencaoRegistro'.
     */
    public void setHrManutencaoRegistro(java.lang.String hrManutencaoRegistro)
    {
        this._hrManutencaoRegistro = hrManutencaoRegistro;
    } //-- void setHrManutencaoRegistro(java.lang.String) 

    /**
     * Sets the value of field 'nomeRazao'.
     * 
     * @param nomeRazao the value of field 'nomeRazao'.
     */
    public void setNomeRazao(java.lang.String nomeRazao)
    {
        this._nomeRazao = nomeRazao;
    } //-- void setNomeRazao(java.lang.String) 

    /**
     * Sets the value of field 'numConta'.
     * 
     * @param numConta the value of field 'numConta'.
     */
    public void setNumConta(int numConta)
    {
        this._numConta = numConta;
        this._has_numConta = true;
    } //-- void setNumConta(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaContaContabilTipoServico
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.response.ListaContaContabilTipoServico unmarshal(java.io.Reader) 

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
